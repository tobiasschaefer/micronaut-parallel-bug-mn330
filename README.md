# micronaut-parallel-bug-mn330

### Task List

- [x] Steps to reproduce provided
- [ ] Stacktrace (if present) provided
- [x] Example that reproduces the problem uploaded to Github
- [x] Full description of the issue provided (see below)

### Steps to Reproduce

1. Checkout https://github.com/tobiasschaefer/micronaut-parallel-bug-mn330
2. Start the application
3. Look at startup time shown in console, e.g. "Startup completed in 10999ms"

### Expected Behaviour

There are two beans annotated with `@Parallel` which both sleep(5000) during initialization.

I expect a startup time of a bit more that 5 seconds because both should be executed in parallel.

### Actual Behaviour

I see a startup time of a bit more than 10 seconds.

@jameskleeh said "Yeah it looks like there is a synchronization block where there shouldn’t be
Can you file an issue?"

### Environment Information

- **Operating System**: Linux
- **Micronaut Version:** 3.3.0 (current)
- **JDK Version:** 11.0.2

### Example Application

https://github.com/tobiasschaefer/micronaut-parallel-bug-mn330

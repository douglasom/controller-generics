package controller.generics

class SomeController {

    def index() { }

    def someAction(SomeCommand cmd) {
        render "${cmd.firstName} ${cmd.lastName}"
    }
}

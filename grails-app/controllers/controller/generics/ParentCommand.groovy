package controller.generics

import grails.validation.Validateable

abstract class ParentCommand<T> implements Validateable {
    String firstName
    T lastName
}

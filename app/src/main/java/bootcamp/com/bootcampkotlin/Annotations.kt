package bootcamp.com.bootcampkotlin

/*1. Annotations can target getters and setters
  2.
* */


@ImPlant class Plant{
    fun trim(){}
    fun fertilize(){}

    @get:OnGet
    val isGrowing :Boolean = true

    /* 1. @set is important to set the property
       2. this annotation could be applied to only mutable properties
     */
    @set:OnSet
    var needfood :Boolean = false
}

annotation class ImPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet
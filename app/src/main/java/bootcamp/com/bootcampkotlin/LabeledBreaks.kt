package bootcamp.com.bootcampkotlin

fun labels(){

    /* 1. Labeled breaks are useful for nested loops
    * */
    loop@for(i in 1..100){
        for (j in 1..100){
            if (i > 10){
                break@loop
            }
        }
    }
}
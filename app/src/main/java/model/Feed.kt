package model

class Feed (
    val userImage:String,
    val userName:String,
    val where:String,
    val postImage:String,
    val likesCount:Int,
    val stories:ArrayList<Osnova>?=null,
)

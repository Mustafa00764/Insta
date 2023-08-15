package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import model.Feed
import java.util.ArrayList

class FeedAdapter(val context:Context,val list:ArrayList<Feed>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val ITEM_STORY=0;
    val ITEM_POST=1;

    override fun getItemViewType(position: Int): Int {
        return if (!list[position].stories.isNullOrEmpty()) ITEM_STORY
        else ITEM_POST
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View
        return if (viewType==ITEM_STORY){
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_osnova_reclama,parent,false)
            StoryViewHolder(view)
        }else{
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_osnova,parent,false)
            PostViewHolder(view)
        }
    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = list[position]
        if (holder is PostViewHolder){

        }
        if (holder is StoryViewHolder){
            holder.apply {
                rvStories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                rvStories.adapter=OsnovaAdapter(feed.stories!!)
            }
        }
    }
class  PostViewHolder(view: View):RecyclerView.ViewHolder(view){
val tvUserName=view.findViewById<TextView>(R.id.tv_user_name)

}
    class  StoryViewHolder(view: View):RecyclerView.ViewHolder(view){
        val rvStories=view.findViewById<RecyclerView>(R.id.rvStory)


    }

}
package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import model.Osnova

class OsnovaAdapter(val list:ArrayList<Osnova>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StoriesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_oval,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    class StoriesViewHolder(view:View):RecyclerView.ViewHolder(view){

    }
}
package com.mistplay.mergecommitpr

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mistplay.mergecommitpr.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(binding.root)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        Log.d("Test", mapFragment.id.toString())
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        val montreal = LatLng(45.5019, -73.5674)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.addMarker(MarkerOptions().position(montreal).title("Marker in Montreal"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        mMap.maxZoomLevel
        mMap.clear()
        mMap.clear()
        mMap.clear()
        mMap.clear()
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
     * labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
     * laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
     * voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat
     * non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
     */

    /**
     * Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
     * laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto
     * beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur
     * aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi
     * nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
     * adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam
     * aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam
     * corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum
     * iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum
     * qui dolorem eum fugiat quo voluptas nulla pariatur?
     */

    /**
     * At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum
     * deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non
     * provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum
     * fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta
     * nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus,
     * omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis
     * debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae
     * non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus
     * maiores alias consequatur aut perferendis doloribus asperiores repellat.
     */
}

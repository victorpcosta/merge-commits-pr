package com.mistplay.mergecommitpr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mistplay.mergecommitpr.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    /**
     * Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit
     */

    /**
     * Fusce nisi velit, rhoncus vehicula leo at, varius facilisis velit. Sed aliquet aliquet nunc.
     * Pellentesque nec vestibulum leo, vel vestibulum libero. Morbi eu enim in lorem ornare fermentum.
     * Fusce massa tellus, scelerisque sodales libero a, consectetur iaculis est. Fusce aliquam nisi
     * id metus laoreet blandit. Morbi et ipsum quis velit rhoncus volutpat in eu neque.
     */

    /**
     * Morbi hendrerit, mauris nec consectetur pellentesque, nibh massa sagittis dui, et sollicitudin
     * risus sem posuere mauris. Cras placerat tempor libero et convallis. Donec nec erat sit amet
     * leo pellentesque venenatis. Donec maximus ex eget dolor malesuada finibus. Suspendisse potenti.
     * Fusce vel accumsan ipsum. Mauris ac arcu justo. Suspendisse eget quam massa. Maecenas viverra
     * ultricies bibendum. Vestibulum dictum, justo posuere posuere auctor, ligula sapien pellentesque
     * nulla, eget vehicula eros leo id elit. Sed sit amet pulvinar risus, a porttitor lectus.
     * Cras quis enim in turpis maximus rhoncus.
     */

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}

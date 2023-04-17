package com.mistplay.mergecommitpr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
}

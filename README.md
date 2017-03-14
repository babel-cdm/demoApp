Demo APP Borja Velasco Try IT! UPM
===================

Aplicación de ejemplo desarrollada durante el taller **Android: desde HelloWorld hasta Google Play** del congreso **Try IT! UPM**

----------


Contenido
-------------

Aplicación simple compuesta por dos Activities. Desde el primero `MainActivity` se va a navegar al segundo `SecondActivity` a través de `Intent` pasándole un **Booleano** y un **String**,

----------

## MainActivity ##

Tendrá cuatro vistas:

>  - `TextView`
>  - `EditText`
>  - `Switch`
>  - `Button`

Con ello haremos que cuando el usuario haga click en el botón:

Comprobaremos si ha introducido algún texto, si no lo ha hecho, mostraremos una alerta en forma de `Toast` 

Comprobaremos el valor introudcido por el usuario en el `EditText` y si ha activado el `Switch` de la siguiente manera:

`String textoIntroducido = input.getText().`
`boolean checked = swt.isChecked();`

## SecondActivity ##

Una vez tengamos los valores se los pasaremos a `SecondActivity` (la segunda pantalla) a través de un `Intent`:

Intent intent = new Intent(MainActivity.this, SecondActivity.class); intent.putExtra("SWT", checked); intent.putExtra("TXT", textoIntroducido); startActivity(intent);

Una vez en `SecondActivity`, leeremos los valores recibimos y mostraremos en un `TextView` el texto introducido por el usuario. Además dependiendo si el `Switch` estaba activado o no, mostraremos u ocultaremos un `ImageView`

`boolean swt = getIntent().getBooleanExtra("SWT", false);`
`String txt = getIntent().getStringExtra("TXT");`

`if (swt) {`
`img.setVisibility(View.VISIBLE);`
`} else {`
`img.setVisibility(View.GONE);`
`}`
`tView.setText(txt);`

>  **Nota:** Es importante acordarnos que para acceder a las vistas
> creadas en los ficheros **Layout.xml** debemos hacerlo utilizando el
> método `FindViewById` de la siguiente manera: 
> 
>     ImageView img = (ImageView) findViewById(R.id.img);
> 
> Utilizando para ello el ID que hayamos asignado a la vista en XML:
> 
>         <ImageView
>         android:id="@+id/img"
>         android:layout_width="match_parent"
>         android:layout_height="350dp"
>         android:layout_alignParentStart="true"
>         android:layout_below="@+id/txt_result"
>         android:layout_marginTop="20dp"
>         android:src="@drawable/logo" />




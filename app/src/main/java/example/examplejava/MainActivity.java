package example.examplejava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Вызывается при входе в "полноценное" состояние.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("tag","CREATE");
        // Инициализируйте Активность.
    }

    // Вызывается, когда метод onCreate завершил свою работу,
    // и используется для восстановления состояния пользовательского
    // интерфейса
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("tag","RESTORE");
        // Восстановите состояние UI из переменной savedInstanceState.
        // Этот объект типа Bundle также был передан в метод onCreate.
    }

    // Вызывается перед тем, как Активность становится "видимой".
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d("tag","RESTART");
        // Загрузите изменения, учитывая то, что Активность
        // уже стала "видимой" в рамках данного процесса.
    }

    // Вызывается в начале "видимого" состояния.
    @Override
    public void onStart(){
        super.onStart();
        Log.d("tag","START");
        // Примените к UI все необходимые изменения, так как
        // Активность теперь видна на экране.
    }

    // Вызывается в начале "активного" состояния.
    @Override
    public void onResume(){
        super.onResume();
        Log.d("tag","RESUME");
        // Возобновите все приостановленные обновления UI,
        // потоки или процессы, которые были "заморожены",
        // когда данный объект был неактивным.
    }

    // Вызывается для того, чтобы сохранить пользовательский интерфейс
    // перед выходом из "активного" состояния.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d("tag","SAVE");
        // Сохраните состояние UI в переменную savedInstanceState.
        // Она будет передана в метод onCreate при закрытии и
        // повторном запуске процесса.
        super.onSaveInstanceState(savedInstanceState);
    }

    // Вызывается перед выходом из "активного" состояния
    @Override
    public void onPause(){
        Log.d("tag","PAUSE");
        // "Замораживает" пользовательский интерфейс, потоки
        // или трудоемкие процессы, которые могут не обновляться,
        // пока Активность не находится на переднем плане.
        super.onPause();
    }

    // Вызывается перед тем, как Активность перестает быть "видимой".
    @Override
    public void onStop(){
        Log.d("tag","STOP");
        // "Замораживает" пользовательский интерфейс, потоки
        // или операции, которые могут подождать, пока Активность
        // не отображается на экране. Сохраняйте все введенные
        // данные и изменения в UI так, как будто после вызова
        // этого метода процесс должен быть закрыт.
        super.onStop();
    }

    // Вызывается перед выходом из "полноценного" состояния.
    @Override
    public void onDestroy(){
        Log.d("tag","DESTROY");
        // Очистите все ресурсы. Это касается завершения работы
        // потоков, закрытия соединений с базой данных и т. д.
        super.onDestroy();
    }
}

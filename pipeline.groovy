def  post_test() {
    echo "This is Job1"
    call_second_job()
}

def call_second_job(){
    build job: 'second/second_job', parameters: [string(name: 'Hierarchy', value: 'SM_GO')], waitForStart: true
}

return this

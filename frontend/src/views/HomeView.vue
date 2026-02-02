<script setup>
import TheWelcome from '../components/TheWelcome.vue'


function something() {
   if(true) {
     if(!false) {
       console.log("I'm creating a big mess here");
     }
   }
 }
</script>

<template>
  <main>
    <TheWelcome />
  </main>
</template>

<template>
  <div class="container">
    <div class="heading-page">
      <p class="heading-page-content">IELTS Mock Tests</p>
    </div>

    <div class="content-page">
      <div class="filter-box">
        <div class="filter-text">FILTERS</div>
        <div class="dropdown">
          <div class="dropdown-text">Type</div>
          <select class="dropdown-box" v-model="selected" type="button">
            <option class="dropdown-item">Reading</option>
            <option class="dropdown-item">Listening</option>
            <option class="dropdown-item">Writting</option>
            <option class="dropdown-item">Speaking</option>
            <div class="dropdown-pic">
              <img src="@/assets/button/Down.png" />
            </div>
          </select>
        </div>
        <div class="dropdown">
          <div class="dropdown-text">Year</div>
          <select class="dropdown-box" v-model="selected" type="button">
            <option class="dropdown-item">2023</option>
            <option class="dropdown-item">2022</option>
            <div class="dropdown-pic">
              <img src="@/assets/button/Down.png" />
            </div>
          </select>
        </div>
        <div class="dropdown">
          <div class="dropdown-text">Sort</div>
          <select class="dropdown-box" v-model="selected" type="button">
            <option class="dropdown-item">Descending</option>
            <option class="dropdown-item">Ascending</option>
            <div class="dropdown-pic">
              <img src="@/assets/button/Down.png" />
            </div>
          </select>
        </div>
      </div>
    </div>
  </div>
</template>

<script></script>

<style scoped>
.heading-page {
  position: relative;
  top: 15px;
  height: 100px;
  align-items: center;
  justify-content: center;

  font-family: "Inter";
  font-style: normal;
  font-weight: 600;
  font-size: 64px;
  line-height: 75px;
  /* identical to box height, or 119% */

  color: #4caf4f;
}

.content-page {
  align-items: center;
  height: 500px;
  position: relative;
}
.filter-box {
  position: fixed;
  width: 251.6px;
  height: 382px;
  left: 200px;
  /* bottom: 350px; */
  top: 200px;
  /* bottom: auto; */

  background: #c8e6c9;
  border-radius: 30px;
}

.filter-text {
  display: flex;
  flex-direction: column;
  height: 50px;
  justify-content: center;
  font-family: "Inter";
  font-style: normal;
  font-weight: 500;
  font-size: 23px;
  line-height: 40px;
  /* identical to box height, or 174% */

  display: flex;
  align-items: center;
  text-align: center;

  color: #000000;
}
.dropdown {
  display: flex;
  padding-bottom: 60px;
}

.dropdown-text {
  position: absolute;
  left: 10%;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 20px;
  line-height: 40px;
  /* or 200% */

  display: flex;
  align-items: center;
  text-align: center;

  color: #000000;
}
.dropdown-box {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  align-items: center;
  position: absolute;
  box-sizing: border-box;
  width: 140.22px;
  height: 40px;
  right: 10%;

  background: #ffffff;
  border-radius: 30px;
  border: 0px;
}

.dropdown-pic {
  height: 22px;
  width: 22px;
  text-align: right;
}

.dropdown-menu {
  background-color: #ffffff;
  width: 140.22px;
}
.dropdown-item {
  background-color: #ffffff;
  width: 140.22px;
  font-family: "Inter";
  font-style: normal;
  text-align: center;
  border-radius: 30px;
}
</style>

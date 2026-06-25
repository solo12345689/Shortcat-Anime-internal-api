.class public abstract LXh/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(LWh/m;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x3c

    .line 10
    .line 11
    invoke-virtual {p0, v0}, LWh/m;->i(C)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0}, LWh/m;->l()C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/16 v3, 0xa

    .line 28
    .line 29
    if-eq v2, v3, :cond_4

    .line 30
    .line 31
    if-eq v2, v0, :cond_4

    .line 32
    .line 33
    const/16 v3, 0x3e

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    const/16 v3, 0x5c

    .line 38
    .line 39
    if-eq v2, v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, LWh/m;->h()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, LWh/m;->h()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LWh/m;->l()C

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, LXh/f;->g(C)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, LWh/m;->h()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {p0}, LWh/m;->h()V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_4
    return v1

    .line 68
    :cond_5
    invoke-static {p0}, LXh/e;->b(LWh/m;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method private static b(LWh/m;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    if-eqz v4, :cond_8

    .line 10
    .line 11
    invoke-virtual {p0}, LWh/m;->l()C

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/16 v5, 0x20

    .line 16
    .line 17
    if-eq v4, v5, :cond_7

    .line 18
    .line 19
    const/16 v6, 0x5c

    .line 20
    .line 21
    if-eq v4, v6, :cond_5

    .line 22
    .line 23
    const/16 v6, 0x28

    .line 24
    .line 25
    if-eq v4, v6, :cond_3

    .line 26
    .line 27
    const/16 v5, 0x29

    .line 28
    .line 29
    if-eq v4, v5, :cond_1

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    xor-int/lit8 p0, v2, 0x1

    .line 38
    .line 39
    return p0

    .line 40
    :cond_0
    invoke-virtual {p0}, LWh/m;->h()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-nez v3, :cond_2

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 48
    .line 49
    invoke-virtual {p0}, LWh/m;->h()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    if-le v3, v5, :cond_4

    .line 56
    .line 57
    return v0

    .line 58
    :cond_4
    invoke-virtual {p0}, LWh/m;->h()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    invoke-virtual {p0}, LWh/m;->h()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LWh/m;->l()C

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-static {v2}, LXh/f;->g(C)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0}, LWh/m;->h()V

    .line 76
    .line 77
    .line 78
    :cond_6
    :goto_1
    move v2, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_7
    xor-int/lit8 p0, v2, 0x1

    .line 81
    .line 82
    return p0

    .line 83
    :cond_8
    return v1
.end method

.method public static c(LWh/m;)Z
    .locals 2

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, LWh/m;->l()C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LWh/m;->h()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    return v1

    .line 20
    :pswitch_1
    invoke-virtual {p0}, LWh/m;->h()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LWh/m;->l()C

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, LXh/f;->g(C)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, LWh/m;->h()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_1
    return v1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(LWh/m;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, LWh/m;->l()C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const/16 v2, 0x27

    .line 18
    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    const/16 v2, 0x28

    .line 22
    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/16 v2, 0x29

    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0}, LWh/m;->h()V

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v2}, LXh/e;->e(LWh/m;C)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    invoke-virtual {p0}, LWh/m;->h()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method public static e(LWh/m;C)Z
    .locals 3

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, LWh/m;->l()C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v2, 0x5c

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, LWh/m;->h()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LWh/m;->l()C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, LXh/f;->g(C)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, LWh/m;->h()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-ne v0, p1, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/16 v1, 0x29

    .line 37
    .line 38
    if-ne p1, v1, :cond_3

    .line 39
    .line 40
    const/16 v1, 0x28

    .line 41
    .line 42
    if-ne v0, v1, :cond_3

    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return p0

    .line 46
    :cond_3
    invoke-virtual {p0}, LWh/m;->h()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    return v1
.end method

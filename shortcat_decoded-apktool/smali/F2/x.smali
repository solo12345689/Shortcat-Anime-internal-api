.class public abstract LF2/x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF2/x$a;
    }
.end annotation


# direct methods
.method public static a(Lw2/g;Ljava/lang/String;[BLjava/util/Map;)[B
    .locals 9

    .line 1
    new-instance v1, Lw2/D;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Lw2/D;-><init>(Lw2/g;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lw2/o$b;

    .line 7
    .line 8
    invoke-direct {p0}, Lw2/o$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lw2/o$b;->j(Ljava/lang/String;)Lw2/o$b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p3}, Lw2/o$b;->e(Ljava/util/Map;)Lw2/o$b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-virtual {p0, p1}, Lw2/o$b;->d(I)Lw2/o$b;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, p2}, Lw2/o$b;->c([B)Lw2/o$b;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lw2/o$b;->b(I)Lw2/o$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lw2/o$b;->a()Lw2/o;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 p0, 0x0

    .line 38
    move-object p1, v3

    .line 39
    :goto_0
    :try_start_0
    new-instance p2, Lw2/m;

    .line 40
    .line 41
    invoke-direct {p2, v1, p1}, Lw2/m;-><init>(Lw2/g;Lw2/o;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    :try_start_1
    invoke-static {p2}, LQ9/a;->b(Ljava/io/InputStream;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_1
    .catch Lw2/x; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    invoke-static {p2}, Lt2/a0;->p(Ljava/io/Closeable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    move-object v8, p0

    .line 55
    goto :goto_2

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    :try_start_3
    invoke-static {p3, p0}, LF2/x;->c(Lw2/x;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    add-int/lit8 p0, p0, 0x1

    .line 68
    .line 69
    invoke-virtual {p1}, Lw2/o;->a()Lw2/o$b;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v0}, Lw2/o$b;->j(Ljava/lang/String;)Lw2/o$b;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lw2/o$b;->a()Lw2/o;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 81
    :try_start_4
    invoke-static {p2}, Lt2/a0;->p(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    :try_start_5
    throw p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 86
    :goto_1
    :try_start_6
    invoke-static {p2}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 87
    .line 88
    .line 89
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 90
    :goto_2
    new-instance v2, LF2/N;

    .line 91
    .line 92
    invoke-virtual {v1}, Lw2/D;->q()Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v1}, Lw2/D;->f()Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v1}, Lw2/D;->p()J

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    invoke-direct/range {v2 .. v8}, LF2/N;-><init>(Lw2/o;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw v2
.end method

.method public static b(Ljava/lang/Throwable;I)I
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lt2/a0;->e0(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Lt2/a0;->d0(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {p0}, LF2/x$a;->a(Ljava/lang/Throwable;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0x1776

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    instance-of v0, p0, Landroid/media/NotProvisionedException;

    .line 30
    .line 31
    const/16 v2, 0x1772

    .line 32
    .line 33
    if-nez v0, :cond_a

    .line 34
    .line 35
    invoke-static {p0}, LF2/x;->d(Ljava/lang/Throwable;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v0, p0, Landroid/media/DeniedByServerException;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    const/16 p0, 0x1777

    .line 47
    .line 48
    return p0

    .line 49
    :cond_3
    instance-of v0, p0, LF2/O;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const/16 p0, 0x1771

    .line 54
    .line 55
    return p0

    .line 56
    :cond_4
    instance-of v0, p0, LF2/h$e;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    const/16 p0, 0x1773

    .line 61
    .line 62
    return p0

    .line 63
    :cond_5
    instance-of p0, p0, LF2/L;

    .line 64
    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    const/16 p0, 0x1778

    .line 68
    .line 69
    return p0

    .line 70
    :cond_6
    const/4 p0, 0x1

    .line 71
    if-ne p1, p0, :cond_7

    .line 72
    .line 73
    return v1

    .line 74
    :cond_7
    const/4 p0, 0x2

    .line 75
    if-ne p1, p0, :cond_8

    .line 76
    .line 77
    const/16 p0, 0x1774

    .line 78
    .line 79
    return p0

    .line 80
    :cond_8
    const/4 p0, 0x3

    .line 81
    if-ne p1, p0, :cond_9

    .line 82
    .line 83
    return v2

    .line 84
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_a
    :goto_0
    return v2
.end method

.method private static c(Lw2/x;I)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lw2/x;->d:I

    .line 2
    .line 3
    const/16 v1, 0x133

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x134

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x5

    .line 13
    if-ge p1, v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lw2/x;->f:Ljava/util/Map;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const-string p1, "Location"

    .line 20
    .line 21
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/List;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    return-object v2
.end method

.method public static d(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/NotProvisionedException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static e(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/ResourceBusyException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.class public final LNb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk5/e;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "expoImageViewWrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LNb/a;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z
    .locals 16

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    const-string v0, "resource"

    .line 4
    .line 5
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "model"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "target"

    .line 16
    .line 17
    move-object/from16 v1, p3

    .line 18
    .line 19
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "dataSource"

    .line 23
    .line 24
    move-object/from16 v2, p4

    .line 25
    .line 26
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    instance-of v0, v6, LPb/c;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    move-object v4, v6

    .line 35
    check-cast v4, LPb/c;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v4, v1

    .line 39
    :goto_0
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v4}, LPb/c;->b()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_1
    if-eqz v0, :cond_2

    .line 51
    .line 52
    move-object v1, v6

    .line 53
    check-cast v1, LPb/c;

    .line 54
    .line 55
    :cond_2
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, LPb/c;->a()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :goto_2
    move-object/from16 v8, p0

    .line 62
    .line 63
    move v5, v0

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_2

    .line 70
    :goto_3
    iget-object v0, v8, LNb/a;->a:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v1, v0

    .line 77
    check-cast v1, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    return v9

    .line 83
    :cond_4
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/h;->getAppContext()LUb/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    new-instance v13, LNb/a$a;

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    move-object v0, v13

    .line 95
    invoke-direct/range {v0 .. v7}, LNb/a$a;-><init>(Lexpo/modules/image/ExpoImageViewWrapper;LS4/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;LZd/e;)V

    .line 96
    .line 97
    .line 98
    const/4 v14, 0x3

    .line 99
    const/4 v15, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    invoke-static/range {v10 .. v15}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 103
    .line 104
    .line 105
    return v9
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LNb/a;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(LU4/q;Ljava/lang/Object;Ll5/d;Z)Z
    .locals 0

    .line 1
    const-string p2, "target"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, LU4/q;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const-string p3, "\n call GlideException#logRootCauses(String) for more detail"

    .line 15
    .line 16
    invoke-static {p2, p3}, LDf/r;->D0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p2, "Unknown error"

    .line 24
    .line 25
    :goto_0
    iget-object p3, p0, LNb/a;->a:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    check-cast p3, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    invoke-virtual {p3}, Lexpo/modules/image/ExpoImageViewWrapper;->getOnError$expo_image_release()Lvc/b;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    new-instance p4, Lexpo/modules/image/records/ImageErrorEvent;

    .line 42
    .line 43
    invoke-direct {p4, p2}, Lexpo/modules/image/records/ImageErrorEvent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p3, p4}, Lvc/b;->invoke(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    const-string p3, "ExpoImage"

    .line 50
    .line 51
    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1, p3}, LU4/q;->g(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    return p1
.end method

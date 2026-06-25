.class public final Lexpo/modules/video/records/VideoTrack$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/records/VideoTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/video/records/VideoTrack$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq2/x;ZLandroid/net/Uri;)Lexpo/modules/video/records/VideoTrack;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    iget-object v2, p1, Lq2/x;->a:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    goto :goto_6

    .line 9
    :cond_0
    new-instance v4, Lexpo/modules/video/records/VideoSize;

    .line 10
    .line 11
    invoke-direct {v4, p1}, Lexpo/modules/video/records/VideoSize;-><init>(Lq2/x;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, p1, Lq2/x;->o:Ljava/lang/String;

    .line 15
    .line 16
    iget v1, p1, Lq2/x;->h:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v6, -0x1

    .line 27
    if-eq v3, v6, :cond_1

    .line 28
    .line 29
    move-object v8, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v8, v0

    .line 32
    :goto_0
    iget v1, p1, Lq2/x;->i:I

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eq v3, v6, :cond_2

    .line 43
    .line 44
    move-object v9, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v9, v0

    .line 47
    :goto_1
    iget v1, p1, Lq2/x;->z:F

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/high16 v6, -0x40800000    # -1.0f

    .line 58
    .line 59
    cmpg-float v3, v3, v6

    .line 60
    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    const/4 v3, 0x0

    .line 66
    :goto_2
    if-nez v3, :cond_4

    .line 67
    .line 68
    move-object v10, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move-object v10, v0

    .line 71
    :goto_3
    new-instance v1, Lexpo/modules/video/records/VideoTrack;

    .line 72
    .line 73
    if-nez v8, :cond_5

    .line 74
    .line 75
    move-object v7, v9

    .line 76
    :goto_4
    move-object v11, p1

    .line 77
    move v6, p2

    .line 78
    move-object v3, p3

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move-object v7, v8

    .line 81
    goto :goto_4

    .line 82
    :goto_5
    invoke-direct/range {v1 .. v11}, Lexpo/modules/video/records/VideoTrack;-><init>(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;)V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_6
    :goto_6
    return-object v0
.end method

.class public final LQ4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# instance fields
.field private final a:LV4/d;


# direct methods
.method public constructor <init>(LV4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LV4/d;

    .line 9
    .line 10
    iput-object p1, p0, LQ4/a;->a:LV4/d;

    .line 11
    .line 12
    return-void
.end method

.method private e(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LQ4/a;->c(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQ4/a;->d(Ljava/nio/ByteBuffer;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LQ4/a;->e(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lorg/aomedia/avif/android/AvifDecoder$Info;

    .line 6
    .line 7
    invoke-direct {p2}, Lorg/aomedia/avif/android/AvifDecoder$Info;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-static {p1, p3, p2}, Lorg/aomedia/avif/android/AvifDecoder;->getInfo(Ljava/nio/ByteBuffer;ILorg/aomedia/avif/android/AvifDecoder$Info;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x6

    .line 20
    const-string v2, "AvifBitmapDecoder"

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-string p1, "Requested to decode byte buffer which cannot be handled by AvifDecoder"

    .line 31
    .line 32
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v0

    .line 36
    :cond_1
    sget-object p3, Lb5/r;->f:LS4/g;

    .line 37
    .line 38
    invoke-virtual {p4, p3}, LS4/h;->c(LS4/g;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    sget-object p4, LS4/b;->b:LS4/b;

    .line 43
    .line 44
    if-ne p3, p4, :cond_2

    .line 45
    .line 46
    sget-object p3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget p3, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->depth:I

    .line 50
    .line 51
    const/16 p4, 0x8

    .line 52
    .line 53
    if-ne p3, p4, :cond_3

    .line 54
    .line 55
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {}, Ls0/M;->a()Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    :goto_0
    iget-object p4, p0, LQ4/a;->a:LV4/d;

    .line 63
    .line 64
    iget v3, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->width:I

    .line 65
    .line 66
    iget p2, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->height:I

    .line 67
    .line 68
    invoke-interface {p4, v3, p2, p3}, LV4/d;->d(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    invoke-static {p1, p3, p2}, Lorg/aomedia/avif/android/AvifDecoder;->decode(Ljava/nio/ByteBuffer;ILandroid/graphics/Bitmap;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    const-string p1, "Failed to decode ByteBuffer as Avif."

    .line 89
    .line 90
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_4
    iget-object p1, p0, LQ4/a;->a:LV4/d;

    .line 94
    .line 95
    invoke-interface {p1, p2}, LV4/d;->c(Landroid/graphics/Bitmap;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_5
    iget-object p1, p0, LQ4/a;->a:LV4/d;

    .line 100
    .line 101
    invoke-static {p2, p1}, Lb5/g;->c(Landroid/graphics/Bitmap;LV4/d;)Lb5/g;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;LS4/h;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LQ4/a;->e(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lorg/aomedia/avif/android/AvifDecoder;->isAvifImage(Ljava/nio/ByteBuffer;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

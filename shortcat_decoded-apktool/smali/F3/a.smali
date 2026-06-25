.class public LF3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/a$a;,
        LF3/a$c;,
        LF3/a$b;,
        LF3/a$d;
    }
.end annotation


# static fields
.field private static final b:Landroid/util/SparseIntArray;

.field private static final c:[I


# instance fields
.field private final a:LF3/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF3/a;->b:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    const/4 v3, 0x2

    .line 15
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x9

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 30
    .line 31
    .line 32
    const/16 v1, 0xa

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x10

    .line 38
    .line 39
    new-array v0, v0, [I

    .line 40
    .line 41
    fill-array-data v0, :array_0

    .line 42
    .line 43
    .line 44
    sput-object v0, LF3/a;->c:[I

    .line 45
    .line 46
    return-void

    .line 47
    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0x10
    .end array-data
.end method

.method constructor <init>(LF3/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF3/a;->a:LF3/a$a;

    .line 5
    .line 6
    return-void
.end method

.method static e(II)I
    .locals 2

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x7

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 v0, 0x4

    .line 9
    and-int/2addr p0, v0

    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x6

    .line 13
    return p0

    .line 14
    :cond_1
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    const/4 p0, 0x3

    .line 18
    return p0

    .line 19
    :pswitch_1
    return v1

    .line 20
    :pswitch_2
    const/16 p0, 0xa

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_3
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :pswitch_4
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :pswitch_5
    return v0

    .line 28
    :pswitch_6
    const/16 p0, 0x8

    .line 29
    .line 30
    return p0

    .line 31
    :pswitch_7
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static f(Ljava/lang/Object;)LF3/a;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LF3/a;

    .line 8
    .line 9
    new-instance v1, LF3/a$c;

    .line 10
    .line 11
    check-cast p0, Landroid/media/AudioAttributes;

    .line 12
    .line 13
    invoke-direct {v1, p0}, LF3/a$c;-><init>(Landroid/media/AudioAttributes;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, LF3/a;-><init>(LF3/a$a;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, LF3/a;

    .line 21
    .line 22
    new-instance v1, LF3/a$b;

    .line 23
    .line 24
    check-cast p0, Landroid/media/AudioAttributes;

    .line 25
    .line 26
    invoke-direct {v1, p0}, LF3/a$b;-><init>(Landroid/media/AudioAttributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LF3/a;-><init>(LF3/a$a;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/a$a;->y()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/a$a;->w()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/a$a;->z()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/a$a;->x()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LF3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, LF3/a;

    .line 8
    .line 9
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 10
    .line 11
    iget-object p1, p1, LF3/a;->a:LF3/a$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a;->a:LF3/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

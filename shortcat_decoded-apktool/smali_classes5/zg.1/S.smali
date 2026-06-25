.class abstract Lzg/S;
.super Ljava/lang/Object;


# static fields
.field static final a:Lzg/V;

.field static final b:Lzg/X;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzg/V;

    .line 2
    .line 3
    invoke-direct {v0}, Lzg/V;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzg/S;->a:Lzg/V;

    .line 7
    .line 8
    new-instance v0, Lzg/X;

    .line 9
    .line 10
    invoke-direct {v0}, Lzg/X;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lzg/S;->b:Lzg/X;

    .line 14
    .line 15
    return-void
.end method

.method static a(Lzg/f;)Lzg/V;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzg/f;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object p0, Lzg/S;->a:Lzg/V;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lzg/V;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lzg/V;-><init>(Lzg/f;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

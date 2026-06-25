.class public abstract Lzg/p;
.super Lzg/y;


# static fields
.field static final a:Lzg/L;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/p$a;

    .line 2
    .line 3
    const-class v1, Lzg/p;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    invoke-direct {v0, v1, v2}, Lzg/p$a;-><init>(Ljava/lang/Class;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lzg/p;->a:Lzg/L;

    .line 10
    .line 11
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static y([B)Lzg/p;
    .locals 1

    .line 1
    array-length p0, p0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lzg/l0;->b:Lzg/l0;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string v0, "malformed NULL encoding encountered"

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
.end method

.method l(Lzg/y;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lzg/p;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x1

    .line 8
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NULL"

    .line 2
    .line 3
    return-object v0
.end method

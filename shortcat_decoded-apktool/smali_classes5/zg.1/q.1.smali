.class public abstract Lzg/q;
.super Lzg/y;


# static fields
.field static final b:Lzg/L;


# instance fields
.field final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/q$a;

    .line 2
    .line 3
    const-class v1, Lzg/q;

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/q$a;-><init>(Ljava/lang/Class;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lzg/q;->b:Lzg/L;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>([BZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, LOh/a;->f([B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    iput-object p1, p0, Lzg/q;->a:[B

    .line 11
    .line 12
    return-void
.end method

.method static y([B)Lzg/q;
    .locals 2

    .line 1
    new-instance v0, Lzg/m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lzg/m0;-><init>([BZ)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/q;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->q([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method final l(Lzg/y;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lzg/q;

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
    check-cast p1, Lzg/q;

    .line 8
    .line 9
    iget-object v0, p0, Lzg/q;->a:[B

    .line 10
    .line 11
    iget-object p1, p1, Lzg/q;->a:[B

    .line 12
    .line 13
    invoke-static {v0, p1}, LOh/a;->c([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method final n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    iget-object v1, p0, Lzg/q;->a:[B

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->o(ZI[B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method final p()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method final t(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/q;->a:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    invoke-static {p1, v0}, Lzg/w;->g(ZI)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/q;->z()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/q;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/i;->b([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

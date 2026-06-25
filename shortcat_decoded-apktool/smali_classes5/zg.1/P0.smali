.class abstract Lzg/P0;
.super Ljava/io/InputStream;


# instance fields
.field protected final a:Ljava/io/InputStream;

.field private b:I


# direct methods
.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/P0;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    iput p2, p0, Lzg/P0;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 1
    iget v0, p0, Lzg/P0;->b:I

    .line 2
    .line 3
    return v0
.end method

.method protected b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/P0;->a:Ljava/io/InputStream;

    .line 2
    .line 3
    instance-of v1, v0, Lzg/M0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lzg/M0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lzg/M0;->h(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

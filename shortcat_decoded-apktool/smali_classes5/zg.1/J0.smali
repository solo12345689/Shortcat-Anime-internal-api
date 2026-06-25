.class Lzg/J0;
.super Lzg/a0;


# instance fields
.field private final d:Z


# direct methods
.method constructor <init>(IIZLzg/D;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p4}, Lzg/a0;-><init>(IILzg/D;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lzg/J0;->d:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d()Lzg/y;
    .locals 4

    .line 1
    iget-object v0, p0, Lzg/a0;->c:Lzg/D;

    .line 2
    .line 3
    iget v1, p0, Lzg/a0;->a:I

    .line 4
    .line 5
    iget v2, p0, Lzg/a0;->b:I

    .line 6
    .line 7
    iget-boolean v3, p0, Lzg/J0;->d:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Lzg/D;->b(IIZ)Lzg/y;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

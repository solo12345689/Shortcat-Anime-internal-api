.class public final Lq2/l$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:[B

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lq2/l$b;->a:I

    .line 4
    iput v0, p0, Lq2/l$b;->b:I

    .line 5
    iput v0, p0, Lq2/l$b;->c:I

    .line 6
    iput v0, p0, Lq2/l$b;->e:I

    .line 7
    iput v0, p0, Lq2/l$b;->f:I

    return-void
.end method

.method private constructor <init>(Lq2/l;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iget v0, p1, Lq2/l;->a:I

    iput v0, p0, Lq2/l$b;->a:I

    .line 10
    iget v0, p1, Lq2/l;->b:I

    iput v0, p0, Lq2/l$b;->b:I

    .line 11
    iget v0, p1, Lq2/l;->c:I

    iput v0, p0, Lq2/l$b;->c:I

    .line 12
    iget-object v0, p1, Lq2/l;->d:[B

    iput-object v0, p0, Lq2/l$b;->d:[B

    .line 13
    iget v0, p1, Lq2/l;->e:I

    iput v0, p0, Lq2/l$b;->e:I

    .line 14
    iget p1, p1, Lq2/l;->f:I

    iput p1, p0, Lq2/l$b;->f:I

    return-void
.end method

.method synthetic constructor <init>(Lq2/l;Lq2/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/l$b;-><init>(Lq2/l;)V

    return-void
.end method


# virtual methods
.method public a()Lq2/l;
    .locals 8

    .line 1
    new-instance v0, Lq2/l;

    .line 2
    .line 3
    iget v1, p0, Lq2/l$b;->a:I

    .line 4
    .line 5
    iget v2, p0, Lq2/l$b;->b:I

    .line 6
    .line 7
    iget v3, p0, Lq2/l$b;->c:I

    .line 8
    .line 9
    iget-object v4, p0, Lq2/l$b;->d:[B

    .line 10
    .line 11
    iget v5, p0, Lq2/l$b;->e:I

    .line 12
    .line 13
    iget v6, p0, Lq2/l$b;->f:I

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    invoke-direct/range {v0 .. v7}, Lq2/l;-><init>(III[BIILq2/l$a;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public b(I)Lq2/l$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/l$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public c(I)Lq2/l$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/l$b;->b:I

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Lq2/l$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/l$b;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e(I)Lq2/l$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/l$b;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f([B)Lq2/l$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/l$b;->d:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Lq2/l$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/l$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method

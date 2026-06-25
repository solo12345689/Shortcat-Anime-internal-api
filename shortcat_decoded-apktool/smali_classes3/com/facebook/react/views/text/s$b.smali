.class final Lcom/facebook/react/views/text/s$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/views/text/q;

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:D

.field private final f:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/text/q;IIZDD)V
    .locals 1

    .line 1
    const-string v0, "props"

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
    iput-object p1, p0, Lcom/facebook/react/views/text/s$b;->a:Lcom/facebook/react/views/text/q;

    .line 10
    .line 11
    iput p2, p0, Lcom/facebook/react/views/text/s$b;->b:I

    .line 12
    .line 13
    iput p3, p0, Lcom/facebook/react/views/text/s$b;->c:I

    .line 14
    .line 15
    iput-boolean p4, p0, Lcom/facebook/react/views/text/s$b;->d:Z

    .line 16
    .line 17
    iput-wide p5, p0, Lcom/facebook/react/views/text/s$b;->e:D

    .line 18
    .line 19
    iput-wide p7, p0, Lcom/facebook/react/views/text/s$b;->f:D

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/text/s$b;->f:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/s$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lcom/facebook/react/views/text/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/s$b;->a:Lcom/facebook/react/views/text/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/s$b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/text/s$b;->e:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/s$b;->d:Z

    .line 2
    .line 3
    return v0
.end method

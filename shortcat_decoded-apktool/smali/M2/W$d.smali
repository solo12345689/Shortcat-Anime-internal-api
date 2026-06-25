.class final LM2/W$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:LM2/W;


# direct methods
.method public constructor <init>(LM2/W;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/W$d;->b:LM2/W;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, LM2/W$d;->a:I

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(LM2/W$d;)I
    .locals 0

    .line 1
    iget p0, p0, LM2/W$d;->a:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W$d;->b:LM2/W;

    .line 2
    .line 3
    iget v1, p0, LM2/W$d;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LM2/W;->X(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(J)I
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W$d;->b:LM2/W;

    .line 2
    .line 3
    iget v1, p0, LM2/W$d;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, LM2/W;->i0(IJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public isReady()Z
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W$d;->b:LM2/W;

    .line 2
    .line 3
    iget v1, p0, LM2/W$d;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LM2/W;->S(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public p(LA2/J;Lz2/f;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W$d;->b:LM2/W;

    .line 2
    .line 3
    iget v1, p0, LM2/W$d;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2, p3}, LM2/W;->e0(ILA2/J;Lz2/f;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

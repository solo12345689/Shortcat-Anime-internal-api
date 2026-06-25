.class public final Lw/r0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/C;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lw/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IILw/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lw/r0;->a:I

    .line 3
    iput p2, p0, Lw/r0;->b:I

    .line 4
    iput-object p3, p0, Lw/r0;->c:Lw/D;

    return-void
.end method

.method public synthetic constructor <init>(IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x12c

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    invoke-static {}, Lw/F;->d()Lw/D;

    move-result-object p3

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lw/r0;-><init>(IILw/D;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lw/s0;)Lw/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw/r0;->f(Lw/s0;)Lw/H0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lw/s0;)Lw/y0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lw/r0;->f(Lw/s0;)Lw/H0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lw/r0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lw/r0;

    .line 7
    .line 8
    iget v0, p1, Lw/r0;->a:I

    .line 9
    .line 10
    iget v2, p0, Lw/r0;->a:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget v0, p1, Lw/r0;->b:I

    .line 15
    .line 16
    iget v2, p0, Lw/r0;->b:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Lw/r0;->c:Lw/D;

    .line 21
    .line 22
    iget-object v0, p0, Lw/r0;->c:Lw/D;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
.end method

.method public f(Lw/s0;)Lw/H0;
    .locals 3

    .line 1
    new-instance p1, Lw/H0;

    .line 2
    .line 3
    iget v0, p0, Lw/r0;->a:I

    .line 4
    .line 5
    iget v1, p0, Lw/r0;->b:I

    .line 6
    .line 7
    iget-object v2, p0, Lw/r0;->c:Lw/D;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2}, Lw/H0;-><init>(IILw/D;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lw/r0;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lw/r0;->c:Lw/D;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget v1, p0, Lw/r0;->b:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
.end method

.class public final LCf/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;
.implements LCf/c;


# instance fields
.field private final a:LCf/i;

.field private final b:I


# direct methods
.method public constructor <init>(LCf/i;I)V
    .locals 1

    .line 1
    const-string v0, "sequence"

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
    iput-object p1, p0, LCf/b;->a:LCf/i;

    .line 10
    .line 11
    iput p2, p0, LCf/b;->b:I

    .line 12
    .line 13
    if-ltz p2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "count must be non-negative, but was "

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x2e

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2
.end method

.method public static final synthetic c(LCf/b;)I
    .locals 0

    .line 1
    iget p0, p0, LCf/b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(LCf/b;)LCf/i;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/b;->a:LCf/i;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(I)LCf/i;
    .locals 2

    .line 1
    iget v0, p0, LCf/b;->b:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, LCf/b;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, LCf/b;-><init>(LCf/i;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance p1, LCf/b;

    .line 13
    .line 14
    iget-object v1, p0, LCf/b;->a:LCf/i;

    .line 15
    .line 16
    invoke-direct {p1, v1, v0}, LCf/b;-><init>(LCf/i;I)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public b(I)LCf/i;
    .locals 3

    .line 1
    iget v0, p0, LCf/b;->b:I

    .line 2
    .line 3
    add-int v1, v0, p1

    .line 4
    .line 5
    if-gez v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LCf/x;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, LCf/x;-><init>(LCf/i;I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance p1, LCf/w;

    .line 14
    .line 15
    iget-object v2, p0, LCf/b;->a:LCf/i;

    .line 16
    .line 17
    invoke-direct {p1, v2, v0, v1}, LCf/w;-><init>(LCf/i;II)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LCf/b$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LCf/b$a;-><init>(LCf/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

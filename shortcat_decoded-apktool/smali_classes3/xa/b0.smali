.class public Lxa/b0;
.super Ljava/util/AbstractList;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/t;
.implements Ljava/util/RandomAccess;


# instance fields
.field private final a:Lxa/t;


# direct methods
.method public constructor <init>(Lxa/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa/b0;->a:Lxa/t;

    .line 5
    .line 6
    return-void
.end method

.method static synthetic b(Lxa/b0;)Lxa/t;
    .locals 0

    .line 1
    iget-object p0, p0, Lxa/b0;->a:Lxa/t;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public J()Lxa/t;
    .locals 0

    .line 1
    return-object p0
.end method

.method public S(Lxa/e;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public c(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b0;->a:Lxa/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b0;->a:Lxa/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lxa/t;->g()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxa/b0;->c(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lxa/b0$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxa/b0$b;-><init>(Lxa/b0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    new-instance v0, Lxa/b0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lxa/b0$a;-><init>(Lxa/b0;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b0;->a:Lxa/t;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.class public LXh/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LXh/a$b;->a:Ljava/util/BitSet;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/BitSet;LXh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LXh/a$b;-><init>(Ljava/util/BitSet;)V

    return-void
.end method

.method static synthetic a(LXh/a$b;)Ljava/util/BitSet;
    .locals 0

    .line 1
    iget-object p0, p0, LXh/a$b;->a:Ljava/util/BitSet;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()LXh/a;
    .locals 2

    .line 1
    new-instance v0, LXh/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LXh/a;-><init>(LXh/a$b;LXh/a$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public c(C)LXh/a$b;
    .locals 1

    .line 1
    const/16 v0, 0x7f

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LXh/a$b;->a:Ljava/util/BitSet;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Can only match ASCII characters"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public d(CC)LXh/a$b;
    .locals 0

    .line 1
    :goto_0
    if-gt p1, p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LXh/a$b;->c(C)LXh/a$b;

    .line 4
    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    int-to-char p1, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0
.end method

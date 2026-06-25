.class public LXh/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LXh/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXh/a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(LXh/a$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LXh/a$b;->a(LXh/a$b;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, LXh/a;->a:Ljava/util/BitSet;

    return-void
.end method

.method synthetic constructor <init>(LXh/a$b;LXh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LXh/a;-><init>(LXh/a$b;)V

    return-void
.end method

.method public static b()LXh/a$b;
    .locals 3

    .line 1
    new-instance v0, LXh/a$b;

    .line 2
    .line 3
    new-instance v1, Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, LXh/a$b;-><init>(Ljava/util/BitSet;LXh/a$a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public a(C)Z
    .locals 1

    .line 1
    iget-object v0, p0, LXh/a;->a:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c()LXh/a$b;
    .locals 3

    .line 1
    new-instance v0, LXh/a$b;

    .line 2
    .line 3
    iget-object v1, p0, LXh/a;->a:Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/util/BitSet;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v2}, LXh/a$b;-><init>(Ljava/util/BitSet;LXh/a$a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

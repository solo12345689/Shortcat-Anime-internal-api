.class public final Ld0/p;
.super LUd/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lb0/d;


# instance fields
.field private final b:Ld0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ld0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LUd/k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/p;->b:Ld0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/p;->b:Ld0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ld0/d;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/p;->b:Ld0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LUd/f;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Ld0/q;

    .line 2
    .line 3
    iget-object v1, p0, Ld0/p;->b:Ld0/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Ld0/d;->q()Ld0/t;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ld0/q;-><init>(Ld0/t;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

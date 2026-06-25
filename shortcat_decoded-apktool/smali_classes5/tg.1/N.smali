.class public final Ltg/N;
.super LUd/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/N$a;
    }
.end annotation


# static fields
.field public static final d:Ltg/N$a;


# instance fields
.field private final b:[Ltg/k;

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltg/N$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltg/N$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltg/N;->d:Ltg/N$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>([Ltg/k;[I)V
    .locals 0

    .line 2
    invoke-direct {p0}, LUd/d;-><init>()V

    .line 3
    iput-object p1, p0, Ltg/N;->b:[Ltg/k;

    .line 4
    iput-object p2, p0, Ltg/N;->c:[I

    return-void
.end method

.method public synthetic constructor <init>([Ltg/k;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ltg/N;-><init>([Ltg/k;[I)V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ltg/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Ltg/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltg/N;->f(Ltg/k;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/N;->b:[Ltg/k;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public bridge f(Ltg/k;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, LUd/b;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltg/N;->i(I)Ltg/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(I)Ltg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/N;->b:[Ltg/k;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Ltg/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Ltg/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltg/N;->t(Ltg/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final l()[Ltg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/N;->b:[Ltg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Ltg/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Ltg/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltg/N;->u(Ltg/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final p()[I
    .locals 1

    .line 1
    iget-object v0, p0, Ltg/N;->c:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge t(Ltg/k;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, LUd/d;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge u(Ltg/k;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, LUd/d;->lastIndexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

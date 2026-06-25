.class LP9/N;
.super LP9/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final e:LP9/u;


# instance fields
.field final transient c:[Ljava/lang/Object;

.field private final transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LP9/N;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, LP9/N;-><init>([Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LP9/N;->e:LP9/u;

    .line 10
    .line 11
    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/u;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP9/N;->c:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, LP9/N;->d:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method c([Ljava/lang/Object;I)I
    .locals 3

    .line 1
    iget-object v0, p0, LP9/N;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LP9/N;->d:I

    .line 5
    .line 6
    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, LP9/N;->d:I

    .line 10
    .line 11
    add-int/2addr p2, p1

    .line 12
    return p2
.end method

.method d()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/N;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method e()I
    .locals 1

    .line 1
    iget v0, p0, LP9/N;->d:I

    .line 2
    .line 3
    return v0
.end method

.method f()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LP9/N;->d:I

    .line 2
    .line 3
    invoke-static {p1, v0}, LO9/n;->h(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/N;->c:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LP9/N;->d:I

    .line 2
    .line 3
    return v0
.end method

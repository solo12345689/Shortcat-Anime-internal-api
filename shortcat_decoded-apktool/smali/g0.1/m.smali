.class public final Lg0/m;
.super Ld0/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/U0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/m$a;,
        Lg0/m$b;
    }
.end annotation


# static fields
.field public static final g:Lg0/m$b;

.field public static final h:I

.field private static final i:Lg0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lg0/m$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg0/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg0/m;->g:Lg0/m$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lg0/m;->h:I

    .line 12
    .line 13
    new-instance v0, Lg0/m;

    .line 14
    .line 15
    sget-object v1, Ld0/t;->e:Ld0/t$a;

    .line 16
    .line 17
    invoke-virtual {v1}, Ld0/t$a;->a()Ld0/t;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, v1, v2}, Lg0/m;-><init>(Ld0/t;I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lg0/m;->i:Lg0/m;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ld0/t;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ld0/d;-><init>(Ld0/t;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic v()Lg0/m;
    .locals 1

    .line 1
    sget-object v0, Lg0/m;->i:Lg0/m;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public bridge A(LY/D;)LY/n2;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ld0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LY/n2;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge B(LY/D;LY/n2;)LY/n2;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LY/n2;

    .line 6
    .line 7
    return-object p1
.end method

.method public a(LY/D;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/J;->b(LY/U0;LY/D;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic builder()LY/U0$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/m;->w()Lg0/m$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic builder()Lb0/f$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lg0/m;->w()Lg0/m$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LY/D;

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
    check-cast p1, LY/D;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lg0/m;->y(LY/D;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LY/n2;

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
    check-cast p1, LY/n2;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lg0/m;->z(LY/n2;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, LY/D;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    check-cast p1, LY/D;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lg0/m;->A(LY/D;)LY/n2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, LY/D;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, LY/D;

    .line 7
    .line 8
    check-cast p2, LY/n2;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lg0/m;->B(LY/D;LY/n2;)LY/n2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public bridge synthetic n()Ld0/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/m;->w()Lg0/m$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public w()Lg0/m$a;
    .locals 1

    .line 1
    new-instance v0, Lg0/m$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg0/m$a;-><init>(Lg0/m;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public x(LY/D;LY/n2;)LY/U0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld0/d;->q()Ld0/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, p1, p2, v2}, Ld0/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)Ld0/t$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p2, Lg0/m;

    .line 18
    .line 19
    invoke-virtual {p1}, Ld0/t$b;->a()Ld0/t;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, LUd/f;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Ld0/t$b;->b()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/2addr v1, p1

    .line 32
    invoke-direct {p2, v0, v1}, Lg0/m;-><init>(Ld0/t;I)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method

.method public bridge y(LY/D;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ld0/d;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge z(LY/n2;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, LUd/f;->containsValue(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

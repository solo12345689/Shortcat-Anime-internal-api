.class public abstract Lte/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lte/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lte/i$a;,
        Lte/i$b;,
        Lte/i$c;,
        Lte/i$d;,
        Lte/i$e;,
        Lte/i$f;,
        Lte/i$g;,
        Lte/i$h;
    }
.end annotation


# static fields
.field public static final e:Lte/i$d;


# instance fields
.field private final a:Ljava/lang/reflect/Member;

.field private final b:Ljava/lang/reflect/Type;

.field private final c:Ljava/lang/Class;

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lte/i$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lte/i$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lte/i;->e:Lte/i$d;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lte/i;->a:Ljava/lang/reflect/Member;

    .line 4
    iput-object p2, p0, Lte/i;->b:Ljava/lang/reflect/Type;

    .line 5
    iput-object p3, p0, Lte/i;->c:Ljava/lang/Class;

    if-eqz p3, :cond_0

    .line 6
    new-instance p1, Lkotlin/jvm/internal/T;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lkotlin/jvm/internal/T;-><init>(I)V

    invoke-virtual {p1, p3}, Lkotlin/jvm/internal/T;->a(Ljava/lang/Object;)V

    invoke-virtual {p1, p4}, Lkotlin/jvm/internal/T;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lkotlin/jvm/internal/T;->c()I

    move-result p2

    new-array p2, p2, [Ljava/lang/reflect/Type;

    invoke-virtual {p1, p2}, Lkotlin/jvm/internal/T;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {p4}, LUd/n;->V0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lte/i;->d:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lte/i;-><init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/i;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/reflect/Member;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/i;->a:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lte/h$a;->b(Lte/h;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public d([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lte/h$a;->a(Lte/h;[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lte/i;->a:Ljava/lang/reflect/Member;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "An object member requires the object instance passed as the first argument."

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public final f()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/i;->c:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/i;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

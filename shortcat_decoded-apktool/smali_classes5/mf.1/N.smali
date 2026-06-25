.class public abstract Lmf/N;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmf/N$a;,
        Lmf/N$b;
    }
.end annotation


# instance fields
.field private final a:LUe/d;

.field private final b:LUe/h;

.field private final c:Lye/h0;


# direct methods
.method private constructor <init>(LUe/d;LUe/h;Lye/h0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lmf/N;->a:LUe/d;

    .line 4
    iput-object p2, p0, Lmf/N;->b:LUe/h;

    .line 5
    iput-object p3, p0, Lmf/N;->c:Lye/h0;

    return-void
.end method

.method public synthetic constructor <init>(LUe/d;LUe/h;Lye/h0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lmf/N;-><init>(LUe/d;LUe/h;Lye/h0;)V

    return-void
.end method


# virtual methods
.method public abstract a()LXe/c;
.end method

.method public final b()LUe/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/N;->a:LUe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lye/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/N;->c:Lye/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LUe/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/N;->b:LUe/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ": "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lmf/N;->a()LXe/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

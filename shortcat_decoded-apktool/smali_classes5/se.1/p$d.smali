.class public final Lse/p$d;
.super Lse/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Lse/n$e;

.field private final b:Lse/n$e;


# direct methods
.method public constructor <init>(Lse/n$e;Lse/n$e;)V
    .locals 1

    .line 1
    const-string v0, "getterSignature"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lse/p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lse/p$d;->a:Lse/n$e;

    .line 11
    .line 12
    iput-object p2, p0, Lse/p$d;->b:Lse/n$e;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/p$d;->a:Lse/n$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lse/n$e;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()Lse/n$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/p$d;->a:Lse/n$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lse/n$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/p$d;->b:Lse/n$e;

    .line 2
    .line 3
    return-object v0
.end method

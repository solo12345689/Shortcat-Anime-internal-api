.class public final Lxb/b$E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb/b;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxb/b;


# direct methods
.method public constructor <init>(Lxb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb/b$E;->a:Lxb/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v1, p1, v1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    aget-object p1, p1, v2

    .line 14
    .line 15
    check-cast p1, Lexpo/modules/kotlin/types/Either;

    .line 16
    .line 17
    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 18
    .line 19
    check-cast v0, Lexpo/modules/kotlin/types/Either;

    .line 20
    .line 21
    iget-object v2, p0, Lxb/b$E;->a:Lxb/b;

    .line 22
    .line 23
    invoke-static {v2, v0, v1, p1}, Lxb/b;->A(Lxb/b;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxb/b$E;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

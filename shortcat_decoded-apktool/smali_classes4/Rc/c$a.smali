.class final LRc/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRc/c;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUb/u;

.field final synthetic b:LRc/c;


# direct methods
.method constructor <init>(LUb/u;LRc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LRc/c$a;->a:LUb/u;

    .line 2
    .line 3
    iput-object p2, p0, LRc/c$a;->b:LRc/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const-string v1, "notifications"

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, LRc/c$a;->a:LUb/u;

    .line 17
    .line 18
    iget-object p2, p0, LRc/c$a;->b:LRc/c;

    .line 19
    .line 20
    invoke-virtual {p2, v1}, LRc/c;->G(Ljava/util/Collection;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p1, p2}, LUb/u;->g(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    if-eqz p2, :cond_2

    .line 29
    .line 30
    const-string p1, "exception"

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object p1, v0

    .line 38
    :goto_1
    instance-of p2, p1, Ljava/lang/Exception;

    .line 39
    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Ljava/lang/Exception;

    .line 44
    .line 45
    :cond_3
    iget-object p1, p0, LRc/c$a;->a:LUb/u;

    .line 46
    .line 47
    const-string p2, "ERR_NOTIFICATIONS_FETCH_FAILED"

    .line 48
    .line 49
    const-string v1, "A list of displayed notifications could not be fetched."

    .line 50
    .line 51
    invoke-interface {p1, p2, v1, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, LRc/c$a;->a(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method

.class final LTc/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTc/c;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUb/u;

.field final synthetic b:LTc/c;


# direct methods
.method constructor <init>(LUb/u;LTc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LTc/c$a;->a:LUb/u;

    .line 2
    .line 3
    iput-object p2, p0, LTc/c$a;->b:LTc/c;

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
    .locals 3

    .line 1
    const-string v0, "Failed to fetch scheduled notifications."

    .line 2
    .line 3
    const-string v1, "ERR_NOTIFICATIONS_FAILED_TO_FETCH"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const-string p1, "notificationRequests"

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v2

    .line 18
    :goto_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, LTc/c$a;->a:LUb/u;

    .line 21
    .line 22
    invoke-interface {p1, v1, v0, v2}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p2, p0, LTc/c$a;->a:LUb/u;

    .line 27
    .line 28
    iget-object v0, p0, LTc/c$a;->b:LTc/c;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LTc/c;->G(Ljava/util/Collection;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p2, p1}, LUb/u;->g(Ljava/util/Collection;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    if-eqz p2, :cond_3

    .line 39
    .line 40
    const-string p1, "exception"

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_3
    const-string p1, "null cannot be cast to non-null type java.lang.Exception"

    .line 47
    .line 48
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v2, Ljava/lang/Exception;

    .line 52
    .line 53
    iget-object p1, p0, LTc/c$a;->a:LUb/u;

    .line 54
    .line 55
    invoke-interface {p1, v1, v0, v2}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
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
    invoke-virtual {p0, p1, p2}, LTc/c$a;->a(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method

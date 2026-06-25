.class public final Lad/a$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lad/a;

.field final synthetic b:Lgc/d;


# direct methods
.method public constructor <init>(Lad/a;Lgc/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lad/a$e;->a:Lad/a;

    .line 2
    .line 3
    iput-object p2, p0, Lad/a$e;->b:Lgc/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, LUb/u;

    .line 10
    .line 11
    iget-object v0, p0, Lad/a$e;->a:Lad/a;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lad/a;->x(Lad/a;LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->w()Ln9/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lad/a$a;

    .line 25
    .line 26
    iget-object v2, p0, Lad/a$e;->b:Lgc/d;

    .line 27
    .line 28
    iget-object v3, p0, Lad/a$e;->a:Lad/a;

    .line 29
    .line 30
    invoke-direct {v1, p1, v2, v3}, Lad/a$a;-><init>(LUb/u;Lgc/d;Lad/a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ln9/i;->c(Ln9/d;)Ln9/i;

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 37
    .line 38
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lad/a$e;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

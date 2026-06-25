.class final LK/i$b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:La1/W;

.field final synthetic c:LQ/F;

.field final synthetic d:La1/t;


# direct methods
.method constructor <init>(LK/y;La1/W;LQ/F;La1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$b$b;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$b$b;->b:La1/W;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$b$b;->c:LQ/F;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$b$b;->d:La1/t;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(ZLZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LK/i$b$b;->a:LK/y;

    .line 4
    .line 5
    invoke-virtual {p1}, LK/y;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LK/i$b$b;->b:La1/W;

    .line 12
    .line 13
    iget-object p2, p0, LK/i$b$b;->a:LK/y;

    .line 14
    .line 15
    iget-object v0, p0, LK/i$b$b;->c:LQ/F;

    .line 16
    .line 17
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LK/i$b$b;->d:La1/t;

    .line 22
    .line 23
    iget-object v2, p0, LK/i$b$b;->c:LQ/F;

    .line 24
    .line 25
    invoke-virtual {v2}, LQ/F;->J()La1/J;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {p1, p2, v0, v1, v2}, LK/i;->k(La1/W;LK/y;La1/U;La1/t;La1/J;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p0, LK/i$b$b;->a:LK/y;

    .line 34
    .line 35
    invoke-static {p1}, LK/i;->i(LK/y;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 39
    .line 40
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, LK/i$b$b;->a(ZLZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

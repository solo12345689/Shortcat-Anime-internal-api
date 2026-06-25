.class public final Lcom/facebook/react/devsupport/v$h;
.super Landroid/os/AsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/v;->y(Ljava/lang/String;Lcom/facebook/react/devsupport/v$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/v$c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/facebook/react/devsupport/v;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/v$c;Ljava/lang/String;Lcom/facebook/react/devsupport/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/v$h;->a:Lcom/facebook/react/devsupport/v$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/v$h;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/v$h;->c:Lcom/facebook/react/devsupport/v;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    .line 1
    const-string v0, "backgroundParams"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/devsupport/v$h$a;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$h;->a:Lcom/facebook/react/devsupport/v$c;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/v$h$a;-><init>(Lcom/facebook/react/devsupport/v$c;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "reload"

    .line 19
    .line 20
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/facebook/react/devsupport/v$h$b;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$h;->a:Lcom/facebook/react/devsupport/v$c;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/v$h$b;-><init>(Lcom/facebook/react/devsupport/v$c;)V

    .line 28
    .line 29
    .line 30
    const-string v1, "devMenu"

    .line 31
    .line 32
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/facebook/react/devsupport/v$h;->a:Lcom/facebook/react/devsupport/v$c;

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/facebook/react/devsupport/v$c;->e()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    new-instance v0, Lx7/b;

    .line 47
    .line 48
    invoke-direct {v0}, Lx7/b;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lx7/b;->e()Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/facebook/react/devsupport/v$h$c;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$h;->a:Lcom/facebook/react/devsupport/v$c;

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/v$h$c;-><init>(Lcom/facebook/react/devsupport/v$c;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$h;->b:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    iget-object v1, p0, Lcom/facebook/react/devsupport/v$h;->c:Lcom/facebook/react/devsupport/v;

    .line 70
    .line 71
    new-instance v2, Lx7/c;

    .line 72
    .line 73
    iget-object v3, p0, Lcom/facebook/react/devsupport/v$h;->b:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, p0, Lcom/facebook/react/devsupport/v$h;->c:Lcom/facebook/react/devsupport/v;

    .line 76
    .line 77
    invoke-static {v4}, Lcom/facebook/react/devsupport/v;->f(Lcom/facebook/react/devsupport/v;)Lx7/f;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-direct {v2, v3, v4, p1, v0}, Lx7/c;-><init>(Ljava/lang/String;Lx7/f;Ljava/util/Map;Lx7/h$b;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lx7/c;->g()V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Lcom/facebook/react/devsupport/v;->h(Lcom/facebook/react/devsupport/v;Lx7/c;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    return-object p1

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v0, "Required value was null."

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/v$h;->a([Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

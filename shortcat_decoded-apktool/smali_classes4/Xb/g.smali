.class public final synthetic LXb/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LXb/i;


# instance fields
.field public final synthetic b:Ljava/lang/reflect/Method;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXb/g;->b:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, LXb/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, LXb/g;->d:Ljava/lang/Class;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LXb/g;->b:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, LXb/g;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LXb/g;->d:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LXb/i$a;->b(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

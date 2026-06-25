.class public final LEe/r;
.super LEe/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOe/h;


# instance fields
.field private final c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(LXe/f;Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, LEe/h;-><init>(LXe/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, LEe/r;->c:Ljava/lang/Class;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public b()LOe/x;
    .locals 2

    .line 1
    sget-object v0, LEe/E;->a:LEe/E$a;

    .line 2
    .line 3
    iget-object v1, p0, LEe/r;->c:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LEe/E$a;->a(Ljava/lang/reflect/Type;)LEe/E;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.class public LTh/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZh/e$c;
.implements LSh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTh/c$a;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method private constructor <init>(LTh/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LTh/c$a;->a(LTh/c$a;)Z

    move-result p1

    iput-boolean p1, p0, LTh/c;->a:Z

    return-void
.end method

.method synthetic constructor <init>(LTh/c$a;LTh/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LTh/c;-><init>(LTh/c$a;)V

    return-void
.end method

.method public static b()LTh/c$a;
    .locals 1

    .line 1
    new-instance v0, LTh/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, LTh/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c()LSh/a;
    .locals 1

    .line 1
    invoke-static {}, LTh/c;->b()LTh/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LTh/c$a;->b()LSh/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public a(LZh/e$b;)V
    .locals 2

    .line 1
    new-instance v0, LUh/a;

    .line 2
    .line 3
    iget-boolean v1, p0, LTh/c;->a:Z

    .line 4
    .line 5
    invoke-direct {v0, v1}, LUh/a;-><init>(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, LZh/e$b;->h(Lbi/a;)LZh/e$b;

    .line 9
    .line 10
    .line 11
    return-void
.end method

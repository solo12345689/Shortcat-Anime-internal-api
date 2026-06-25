.class LV9/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LV9/d$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:LV9/e;


# direct methods
.method private constructor <init>(LV9/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LV9/d$c;->a:LV9/e;

    return-void
.end method

.method synthetic constructor <init>(LV9/e;LV9/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LV9/d$c;-><init>(LV9/e;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LV9/d$c;->a:LV9/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, p1, v1}, LV9/e;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

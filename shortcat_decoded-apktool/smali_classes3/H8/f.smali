.class public final LH8/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field protected a:Ljava/lang/Boolean;

.field protected b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LH8/f;->a:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(LH8/g;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LH8/f;->a:Ljava/lang/Boolean;

    .line 3
    invoke-virtual {p1}, LH8/g;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LH8/f;->a:Ljava/lang/Boolean;

    .line 4
    invoke-virtual {p1}, LH8/g;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LH8/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LH8/f;
    .locals 0

    .line 1
    iput-object p1, p0, LH8/f;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

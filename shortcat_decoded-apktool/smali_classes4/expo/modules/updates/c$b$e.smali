.class public final Lexpo/modules/updates/c$b$e;
.super Lexpo/modules/updates/c$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final b:Lrd/d;


# direct methods
.method public constructor <init>(Lrd/d;)V
    .locals 2

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/updates/c$b$d;->a:Lexpo/modules/updates/c$b$d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v0, v1}, Lexpo/modules/updates/c$b;-><init>(Lexpo/modules/updates/c$b$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lexpo/modules/updates/c$b$e;->b:Lrd/d;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Lrd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/c$b$e;->b:Lrd/d;

    .line 2
    .line 3
    return-object v0
.end method

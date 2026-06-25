.class public interface abstract LK4/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK4/c$a$a;
    }
.end annotation


# static fields
.field public static final a:LK4/c$a$a;

.field public static final b:LK4/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LK4/c$a$a;->a:LK4/c$a$a;

    .line 2
    .line 3
    sput-object v0, LK4/c$a;->a:LK4/c$a$a;

    .line 4
    .line 5
    new-instance v0, LK4/b$a;

    .line 6
    .line 7
    invoke-direct {v0}, LK4/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LK4/c$a;->b:LK4/c$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(LK4/d;LG4/i;)LK4/c;
.end method
